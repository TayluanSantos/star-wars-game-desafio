package com.tayluan.starwargame.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_planeta")
public class Planeta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_planeta")
    private Long id;

    private String nome;
    private String clima;
    private String terreno;
    @Column(name = "filmes_aparicoes")
    private Integer filmesAparicoes;

    public Planeta() {

    }

    public Planeta(String nome, String clima, String terreno, Integer aparicoes) {
        this.nome = nome;
        this.clima = clima;
        this.terreno = terreno;
        this.filmesAparicoes = aparicoes;
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
