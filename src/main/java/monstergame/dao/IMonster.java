package monstergame.dao;

import monstergame.models.Monster;

public interface IMonster {

    Monster baseAttack(Monster m);

    void name();

    void specialAttack();

    void takeDamage(int damage);

    void loot();

}
