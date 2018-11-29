//package gray.adts.graph; //

import java.util.List;

public interface Graph<T> {

    /*
        addVertex( Vertex<T> v )
        pre-condition: v is not already in the graph
        responsibilities: insert a Vertex into this graph
        post-condition: a Vertex is added to this graph, number of vertices is incremented by 1
        exception: if Vertex v is already in this graph
        returns: nothing
    */
    void addVertex( Vertex<T> v );


    /*
        addEdge( Vertex<T> v1 , Vertex<T> v2 )
        pre-condition: v1 and v2 are Vertices in this graph and aren’t already connected by an edge
		responsibilities: connect Vertices v1 to v2; if this is an undirected graph, this edge also connects v2 to v1
		post-condition: an edge connecting v1 and v2 is added to this graph number of edges is incremented by 1
		exception: if v1 or v2 are not in the graph or are already connected by an edge
		returns: nothing
     */
    void addEdge( Vertex<T> v1 , Vertex<T> v2 );

    /*
        removeVertex( Vertex<T> v )
        pre-condition: v is a Vertex in this graph responsibilities: remove Vertex v from this graph
		post-condition: Vertex v is removed from this graph, All edges incident on v are removed number of vertices is decremented by 1 number of edges is decremented by degree( v )
		exception: if v is not in this graph
		returns: nothing
     */
    void removeVertex( Vertex<T> v );


    /*
        removeEdge( Vertex<T> v1, Vertex<T> v2 )
        pre-condition: v1 and v2 are vertices in this graph and an edge exists from v1 to v2
		responsibilities: remove from this graph the edge connecting v1 to v2; if this is an undirected graph, there is no longer an edge from v2 to v1
		post-condition: the edge connecting v1 and v2 is removed from this graph number of edges is decremented by 1
		exception: if v1 or v2 are not in this graph, or if no edge from v1 to v2 exists
		returns: nothing
     */
    void removeEdge( Vertex<T> v1, Vertex<T> v2 );



    /*
        getNeighbors ( Vertex v )
		pre-condition: v is a Vertex in this graph
		responsibilities: get the neighbors of Vertex v from this graph
		post-condition: the graph is unchanged
		exception: if v is not in this graph
		returns: a collection containing the Vertices incident on v
     */
    List< Vertex<T> > getNeighbors ( Vertex<T> v );

    /*
        getNumberOfVertices()
        pre-condition: none
		responsibilities: get the number of vertices in this graph
		post-condition: the graph is unchanged
		returns: the number of vertices in this graph
     */
    int getNumberOfVertices();

    /*
        getNumberOfEdges()
		pre-condition: none
		responsibilities: get the number of edges in this graph
		post-condition: the graph is unchanged
		returns: the number of edges in this graph
     */
    int getNumberOfEdges();
}