package uebung_06;

public class Roboter
{
    public int x = 0;
    public int y = 0;

    Direction direction = new Direction();

    public String abfolge = "";

    public int spielfeldGroesse = 0;

    public Roboter(int spielfeldGroesse)
    {
        this.spielfeldGroesse = spielfeldGroesse;
    }
    public void setPosition(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public String getPosition()
    {
        return x + ", " + y;
    }

    public void moveUp()
    {
        if (0 < y)
        {
            y--;
        }
        else
        {
            System.out.println("boink");
        }
    }
    public void moveDown()
    {
        if (y < spielfeldGroesse-1)
        {
            y++;
        }
        else
        {
            System.out.println("boink");
        }
    }
    public void moveLeft()
    {
        if (0 < x)
        {
            x--;
        }
        else
        {
            System.out.println("boink");
        }
    }
    public void moveRight()
    {
        if (x < spielfeldGroesse-1)
        {
            x++;
        }
        else
        {
            System.out.println("boink");
        }
    }

    public void abfolgeAbarbeiten()
    {
        char firstChar = abfolge.charAt(0);
        if(firstChar == 'w')
        {
            moveUp();
        }
        else if (firstChar == 's')
        {
            moveDown();
        }
        else if (firstChar == 'a')
        {
            moveLeft();
        }
        else if (firstChar == 'd')
        {
            moveRight();
        }
        else if (firstChar == 'l')
        {
            direction.turnLeft();
        }
        else if (firstChar == 'r')
        {
            direction.turnRight();
        }
        else if (firstChar == 'f')
        {
            if (direction.getDirection() == 0)
            {
                moveUp();
            }
            else if (direction.getDirection() == 1)
            {
                moveRight();
            }
            else if (direction.getDirection() == 2)
            {
                moveDown();
            }
            else if (direction.getDirection() == 3)
            {
                moveLeft();
            }
        }
        else if (firstChar == 'b')
        {
            if (direction.getDirection() == 0)
            {
                moveDown();
            }
            else if (direction.getDirection() == 1)
            {
                moveLeft();
            }
            else if (direction.getDirection() == 2)
            {
                moveUp();
            }
            else if (direction.getDirection() == 3)
            {
                moveRight();
            }
        }
        abfolge = abfolge.substring(1);
        System.out.println(abfolge);
    }
    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }


    public void setY(int y)
    {
        this.y = y;
    }
    public String getAbfolge()
    {
        return abfolge;
    }

    public void setAbfolge(String abfolge)
    {
        //StringBuilder sb = new StringBuilder(abfolge);
        //this.abfolge = sb.reverse().toString();
        this.abfolge = abfolge;
    }
}
