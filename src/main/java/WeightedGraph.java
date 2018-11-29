/**
 * Created by jo52 on 29/11/18.
 */
public interface WeightedGraph<T> extends Graph<T> {

    /*
        addEdge( Vertex v1 , Vertex v2, int w)
		pre-condition: v1 and v2 are Vertices in this graph and are not already connected by an edge; w is >= 0
		responsibilities: connect Vertices v1 to v2 with weight w; if this is an undirected graph, this edge also connects v2 to v1
		post-condition: an edge connecting v1 and v2 with weight w is added to this graph number of edges is incremented by 1
		exception: if v1 or v2 are not in the graph, are already connected by an edge, or w < 0
		returns: nothing
     */
    void addEdge( Vertex v1 , Vertex v2, int w);

    /*
        getEdgeWeight( Vertex v1 , Vertex v2 )
		pre-condition: v1 and v2 are Vertices in this graph and are connected by an edge
		responsibilities: get the weight of the edge connecting Vertices v1 to v2 post-condition: the graph is unchanged
		exception: if v1 or v2 are not in the graph or are not connected by an edge
		returns: the weight of the edge connecting v1 to v2
     */
    int getEdgeWeight( Vertex v1 , Vertex v2 );

    /*
        setEdgeWeight( Vertex v1 , Vertex v2 , int newWeight)
		pre-condition: v1 and v2 are Vertices in this graph and are connected by an edge. newWeight is >= 0
		responsibilities: set the weight of the edge connecting Vertices v1 to v2 to newWeight
		post-condition: the graph is unchanged
		exception: if v1 or v2 are not in the graph, are not connected by an edge, or newWeight < 0
		returns: nothing
     */
    void setEdgeWeight( Vertex v1 , Vertex v2 , int newWeight);
}
