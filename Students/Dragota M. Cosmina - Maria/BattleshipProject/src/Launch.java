/**
 * To appear onscreen, every GUI component must be part of a containment
 * hierarchy. A containment hierarchy is a tree of components that has a
 * top-level container as its root. Each GUI component can be contained only
 * once. If a component is already in a container and you try to add it to
 * another container, the component will be removed from the first container and
 * then added to the second. Each top-level container has a content pane that,
 * generally speaking, contains (directly or indirectly) the visible components
 * in that top-level container's GUI.
 * 
 * @author cosmina
 *
 */
public class Launch {
	public static void main(String[] args) {
		Game game = new Game("Battleship", 600, 1000);
		game.start();// apeleaza run
	}
}
