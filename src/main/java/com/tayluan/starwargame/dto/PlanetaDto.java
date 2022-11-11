package com.tayluan.starwargame.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class PlanetaDto {
    private Long id;
    @NotNull(message = "O valor do campo não pode ser nulo.Por favor,insira os dados")
    @NotEmpty(message = "O valor do campo não pode ser nulo.Por favor,insira os dados")
    private String nome;
    @NotNull(message = "O valor do campo não pode ser nulo.Por favor,insira os dados")
    @NotEmpty(message = "O valor do campo não deve ser vazio.Por favor,insira os dados")
    private String clima;
    @NotNull(message = "O valor do campo não pode ser nulo.Por favor,insira os dados")
    @NotEmpty(message = "O valor do campo não deve ser vazio.Por favor,insira os dados")
    private String terreno;
    private Integer filmesAparicoes;


    public PlanetaDto() {

    }

    public PlanetaDto(Long id, String nome, String clima, String terreno, Integer filmesAparicoes) {
        this.id = id;
        this.nome = nome;
        this.clima = clima;
        this.terreno = terreno;
        this.filmesAparicoes = filmesAparicoes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getTerreno() {
        return terreno;
    }

    public void setTerreno(String terreno) {
        this.terreno = terreno;
    }

    public Integer getFilmesAparicoes() {
        return filmesAparicoes;
    }

    public void setFilmesAparicoes(Integer filmesAparicoes) {
        this.filmesAparicoes = filmesAparicoes;
    }
}
