
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
            default:
                tile = new Tile("grass.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
        }
        return tile;
    }
}
