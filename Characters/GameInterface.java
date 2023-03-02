package org.example.Characters;

import java.util.ArrayList;

public interface GameInterface {
    StringBuilder getInfo();
    void step(ArrayList <BaseCharacter> b1,ArrayList <BaseCharacter> b2 );

}
