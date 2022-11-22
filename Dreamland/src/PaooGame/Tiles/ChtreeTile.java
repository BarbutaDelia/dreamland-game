package PaooGame.Tiles;
import PaooGame.Graphics.Assets;

/*! \class public class PinkSoil1Tile extends Tile
    \brief Abstractizeaza notiunea de dala de tip sol roz 1.
 */
public class ChtreeTile extends Tile
{
    /*! \fn public GrassTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public ChtreeTile(int id)
    {
        /// Apel al constructorului clasei de baza
        super(Assets.chtree, id);
    }
    public boolean IsSolid(){
        return true;
    }
}
