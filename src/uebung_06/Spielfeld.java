package uebung_06;

public class Spielfeld
{
    private int spielfeldGroesse = 10;

    Position[] letzePosition = new Position[5];
    String[][] arr = new String[spielfeldGroesse][spielfeldGroesse];

    Spielfeld(int sfgroesse)
    {
        this.spielfeldGroesse = sfgroesse;
    }

    public void setBlank()
    {
        for (int i = 0; i < spielfeldGroesse; i++)
        {
            for (int j = 0; j < spielfeldGroesse; j++)
            {
                arr[i][j] = "0 ";
            }

        }

    }

    public void platziereRoboter(Roboter r)
    {
        setBlank();
        for (Position p : letzePosition)
        {
            if(p != null)
            {
                arr[p.getY()][p.getX()] = ". ";
            }
        }
        arr[r.getY()][r.getX()] = "@ ";
        addletztePosition(r.getX(),r.getY());
    }

    public void addletztePosition(int x, int y)
    {
        Position p = new Position(x,y);
        for (int i = 4; 0 <= i ; i--)
        {
            if(0 < i && letzePosition[i-1] != null)
            {
                letzePosition[i] = letzePosition[i-1];
            }
        }
        letzePosition[0] = p;
    }

    public int getSpielfeldGroesse()
    {
        return spielfeldGroesse;
    }

    public void setSpielfeldGroesse(int spielfeldGroesse)
    {
        this.spielfeldGroesse = spielfeldGroesse;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (String[] s: arr)
        {
            for (String ss: s)
            {
                sb.append(ss);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
