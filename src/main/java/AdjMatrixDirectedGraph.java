import java.util.*;

public class AdjMatrixDirectedGraph<T> implements Graph<T> {

    protected int numberOfVertices;
    protected int numberOfEdges;
    protected int[][] adjMatrix;
    protected Vertex<T>[] vertices;
    protected int v1Pos, v2Pos;
    protected static int SIZE = 20;

    public AdjMatrixDirectedGraph() {
        this.numberOfVertices = 0;
        this.numberOfEdges = 0;
        this.adjMatrix = new int[this.SIZE][this.SIZE];
        this.vertices = new Vertex[this.SIZE];
    }

    @Override
    public void addVertex(Vertex<T> v) {

    }

    @Override
    public void addEdge(Vertex<T> v1, Vertex<T> v2) {

    }

    @Override
    public void removeVertex(Vertex<T> v) {

    }

    @Override
    public void removeEdge(Vertex<T> v1, Vertex<T> v2) {

    }

    @Override
    public List<Vertex<T>> getNeighbors(Vertex<T> v) {
        return null;
    }

    @Override
    public int getNumberOfVertices() {
        return 0;
    }

    @Override
    public int getNumberOfEdges() {
        return 0;
    }
}