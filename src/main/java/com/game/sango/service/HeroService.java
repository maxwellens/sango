package com.game.sango.service;

import com.game.sango.bean.Hero;
import com.game.sango.bean.Page;
import com.game.sango.dao.HeroDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class HeroService
{
    @Autowired
    private HeroDao heroDao;

    public Page<Hero> findHeros(Map<String, Object> map)
    {
        List<Hero> list = heroDao.findHeros(map);
        int count = heroDao.findHerosCount(map);
        return new Page<>(list, count);
    }

    public Hero findHeroById(Integer id)
    {
        return heroDao.findHeroById(id);
    }

    public int insertHero(Hero hero)
    {
        return heroDao.insertHero(hero);
    }

    public void deleteHeroById(Integer id)

    {
        heroDao.deleteHeroById(id);
    }

    public void deleteHeros(String ids)
    {
        heroDao.deleteHeros(ids);
    }

    public int updateHero(Hero hero)
    {
        return heroDao.updateHero(hero);
    }

}
