package uebung_08;

import java.awt.Point;

abstract class AbstractPilz {
   Point position = new Point();

   abstract void setPosition(int x, int y);

   abstract int getX();
   abstract int getY();
   abstract Point getPosition();
}
