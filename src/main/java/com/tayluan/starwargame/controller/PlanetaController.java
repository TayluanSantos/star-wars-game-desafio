package com.tayluan.starwargame.controller;

import com.tayluan.starwargame.dto.PlanetaDto;
import com.tayluan.starwargame.service.PlanetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/planetas")
public class PlanetaController {
    @Autowired
    PlanetService planetService;

    @GetMapping
    public ResponseEntity<List<PlanetaDto>> buscarTodosOsPlanetas() {
        return ResponseEntity.status(HttpStatus.OK).body(planetService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlanetaDto> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(planetService.buscarPorId(id));
    }

    @GetMapping("/search")
    public ResponseEntity<PlanetaDto> buscarPorNome(@RequestParam String nome) {
        return ResponseEntity.status(HttpStatus.OK).body(planetService.buscarPorNome(nome));
    }

    @PostMapping
    public ResponseEntity<PlanetaDto> criarNovoPlaneta(@Valid @RequestBody PlanetaDto planetaForm) {
        return ResponseEntity.status(HttpStatus.CREATED).body(planetService.salvar(planetaForm));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarPlaneta(@PathVariable Long id) {
        planetService.deletar(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
