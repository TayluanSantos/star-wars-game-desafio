package com.tayluan.starwargame.client;

import com.tayluan.starwargame.dto.PlanetaResultResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "planetaClient", url = "https://swapi.dev/api/")
public interface PlanetaClient {
    @GetMapping("/planets")
    public PlanetaResultResponse buscarPorNome(@RequestParam String search);

}

