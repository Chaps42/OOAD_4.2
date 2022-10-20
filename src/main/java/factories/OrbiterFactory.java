package factories;

import entity.*;
import dungeon.Dungeon;


public class OrbiterFactory extends CreatureFactory{
       
    //Factory Pattern Subclasses
    public OrbiterFactory(Dungeon dungeonRef){
        super(dungeonRef);
    }

    public Creature spawnCreature(){
        return new Blinker(this.id, this.dungeon);
    }
}