import java.util.ArrayList;


public class Node {
	private Node parent;
	private String name;
	private int alpha, beta;
	private ArrayList<Node> children;

	public Node(Node parent, String name, int alpha, int beta){
		this.parent = parent;
		this.name = name;
		this.alpha = alpha;
		this.beta = beta;
		this.children = new ArrayList<Node>();
	}
	
	public Node(Node parent, String name, int alpha, int beta, ArrayList<Node> children){
		this.parent = parent;
		this.name = name;
		this.alpha = alpha;
		this.beta = beta;
		this.children = children;
	}
	
	public void addChild(Node a){
		this.children.add(a);
	}
	
	public Node getChild(int a){
		return children.get(a);
	}
	public Node getParent(){
		return parent;
	}
	
	public void setParent(Node parent){
		this.parent = parent;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getAlpha(){
		return alpha;
	}
	
	public void setAlpha(int alpha){
		this.alpha = alpha;
	}
	
	public int getBeta(){
		return beta;
	}
	
	public void setBeta(int beta){
		this.beta = beta;
	}
	
	public ArrayList<Node> getChildren(){
		return children;
	}
	
	public void setChildren(ArrayList<Node> children){
		this.children = children;
	}
}
