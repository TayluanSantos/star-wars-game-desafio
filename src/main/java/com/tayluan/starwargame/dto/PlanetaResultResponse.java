package com.tayluan.starwargame.dto;

import java.util.List;

public class PlanetaResultResponse {
    private List<PlanetaSwapiResponse> results;
    public List<PlanetaSwapiResponse> getResults() {
        return results;
    }

    public void setResults(List<PlanetaSwapiResponse> results) {
        this.results = results;
    }
}
