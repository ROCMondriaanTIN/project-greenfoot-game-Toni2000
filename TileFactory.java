
/**
 *
 * @author R. Springer
 */
public class TileFactory {

    /**
     * Creates a Tile object based on the mapIcon number you give
     *
     * @param mapIcon number
     * @return Tile tile object
     */
    public static Tile createTile(int mapIcon) {
        Tile tile;
        switch (mapIcon) {
            case 16:
                tile = new Tile("grass.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 17:
                tile = new Tile("grass_tile.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 15:
                tile = new Tile("star.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 45:
                tile = new Tile("L_A.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 46:
                tile = new Tile("L_B.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 47:
                tile = new Tile("L_C.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 48:
                tile = new Tile("L_D.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 49:
                tile = new Tile("L_E.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 50:
                tile = new Tile("L_F.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 51:
                tile = new Tile("L_G.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 52:
                tile = new Tile("L_H.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 53:
                tile = new Tile("L_I.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 54:
                tile = new Tile("L_J.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 55:
                tile = new Tile("L_K.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 56:
                tile = new Tile("L_L.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 57:
                tile = new Tile("L_M.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 58:
                tile = new Tile("L_N.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 59:
                tile = new Tile("L_O.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 60:
                tile = new Tile("L_P.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 61:
                tile = new Tile("L_Q.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 62:
                tile = new Tile("L_R.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 63:
                tile = new Tile("L_S.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 64:
                tile = new Tile("L_T.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 65:
                tile = new Tile("L_U.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 66:
                tile = new Tile("L_V.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 67:
                tile = new Tile("L_W.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 68:
                tile = new Tile("L_X.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 69:
                tile = new Tile("L_Y.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 70:
                tile = new Tile("L_Z.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            default:
                tile = new Tile("grass.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
        }
        return tile;
    }
}
