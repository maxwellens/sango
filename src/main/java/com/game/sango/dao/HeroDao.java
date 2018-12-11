package com.game.sango.dao;

import com.game.sango.bean.Hero;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface HeroDao
{
    List<Hero> findHeros(Map<String, Object> map);

    Integer findHerosCount(Map<String, Object> map);

    Hero findHeroById(Integer id);

    int insertHero(Hero hero);

    void deleteHeroById(Integer id);

    void deleteHeros(String ids);

    int updateHero(Hero hero);

}
