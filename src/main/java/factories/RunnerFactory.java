package factories;

import entity.*;
import entity.Character;
import dungeon.Dungeon;

public class RunnerFactory extends CharacterFactory {


    /**
     * @param dungeonRef Dungeon
     *
     * Constructor for the Runner factory.
     */
    public RunnerFactory(final Dungeon dungeonRef) {
        super(dungeonRef);
    }


    /* (non-Javadoc)
     * @see factories.CharacterFactory#spawnCharacter(java.lang.String)
     */
    public Character spawnCharacter(String name) {
        return new Runner(this.id, this.dungeon, name);
    }
}
