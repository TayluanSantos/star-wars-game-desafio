package com.tayluan.starwargame.service;

import com.tayluan.starwargame.client.PlanetaClient;
import com.tayluan.starwargame.dto.PlanetaDto;
import com.tayluan.starwargame.dto.PlanetaSwapiResponse;
import com.tayluan.starwargame.exception.ResourceNotFoundException;
import com.tayluan.starwargame.mapper.DozerMapper;
import com.tayluan.starwargame.model.Planeta;
import com.tayluan.starwargame.repository.PlanetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlanetService {

    @Autowired
    PlanetaClient client;
    @Autowired
    PlanetaRepository repository;

    public List<PlanetaDto> buscarTodos() {

        List<Planeta> listaDePlanetas = repository.findAll();
        List<PlanetaDto> listaDePlanetaDtos = DozerMapper.parseListOfObjects(listaDePlanetas, PlanetaDto.class);

        return listaDePlanetaDtos;
    }

    public PlanetaDto buscarPorId(Long id) {

        Planeta planetaEntity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Planeta não encontrado"));
        PlanetaDto planetaDto = DozerMapper.parseObject(planetaEntity, PlanetaDto.class);

        return planetaDto;
    }

    public PlanetaDto buscarPorNome(String nomeDoPlaneta) {

        Planeta planetaEntity = repository.findByNome(nomeDoPlaneta).orElseThrow(() -> new ResourceNotFoundException("Planeta não encontrado"));
        PlanetaDto planetaDto = DozerMapper.parseObject(planetaEntity, PlanetaDto.class);

        return planetaDto;
    }

    public PlanetaDto salvar(PlanetaDto planetaForm) {

        List<PlanetaSwapiResponse> response = client.buscarPorNome(planetaForm.getNome()).getResults();
        if (response.isEmpty()) {
            planetaForm.setFilmesAparicoes(0);
        }
        response.forEach(p -> planetaForm.setFilmesAparicoes(p.getFilms().size()));

        Planeta planetaEntity = DozerMapper.parseObject(planetaForm, Planeta.class);
        PlanetaDto planetaDto = DozerMapper.parseObject(repository.save(planetaEntity), PlanetaDto.class);

        return planetaDto;
    }

    public void deletar(Long id) {
        Planeta planetaEntity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Planeta não encontrado"));
        repository.delete(planetaEntity);
    }

}

