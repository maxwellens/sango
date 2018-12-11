package com.game.sango.web;

import com.game.sango.bean.Hero;
import com.game.sango.bean.Page;
import com.game.sango.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RestController
public class HeroController
{
    @Autowired
    private HeroService heroService;

    @GetMapping("findHeros")
    @ResponseBody
    public Page<Hero> findHeros(Integer page, Integer limit)
    {
        Map<String, Object> map = new HashMap<>();
        if (page != null)
        {
            map.put("start", (page - 1) * limit);
        }
        if (limit != null)
        {
            map.put("offset", limit);
        }
        return heroService.findHeros(map);
    }
}
