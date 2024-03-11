package uebung_08;

import java.awt.*;

public class Pilz extends AbstractPilz {

    public int getX(){
        return position.x;
    }

    public int getY(){
        return position.y;
    }

    @Override
    void setPosition(int x, int y) {
        this.position.x = x;
        this.position.y = y;
    }

    @Override
    Point getPosition() {
        return position;
    }
}
