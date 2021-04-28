package monstergame.dao;

import monstergame.models.Hero;

public interface IHero {

    Hero baseAttack(Hero h);

    void name();

    void specialAttack();

    void takeDamage(int damage);

    void loot();

}
