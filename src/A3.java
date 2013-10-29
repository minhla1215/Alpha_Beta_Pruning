import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;


public class A3 {

	private static Tree tree;
	private static Node root;
	private static String output = "output.txt";

	private static PrintStream ps = null;
	
	public static void main(String args[]){
		tree = new Tree();
		root = tree.getRoot();
		
		try{
			File file = new File(output);
			if (!file.exists()) {
				file.createNewFile();
			}
			ps = new PrintStream(new FileOutputStream(output));
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("\nValue of Max Node A = " + maxValue(root));
		if(root.getChild(0).getBeta() > root.getChild(1).getBeta())
			System.out.println("\nMove that Max Node A would make is = " + root.getChild(0).getName());
		else
			System.out.println("\nMove that Max Node A would make is = " + root.getChild(1).getName());
	}
	
	public static int maxValue(Node node){		
		//System.out.println(node.getName() + " " + node.getChildren().size());
		if(node.getChildren().isEmpty())
			return node.getAlpha();
		
		if(node.getParent() != null){
			node.setBeta(node.getParent().getBeta());
			node.setAlpha(node.getParent().getAlpha());
		}
		int v = Integer.MIN_VALUE;
		for(int i = 0; i < node.getChildren().size(); i++){
			v = max(v, minValue(node.getChild(i)));
			if(node.getParent() == null){
				node.setAlpha(max(node.getAlpha(),v));
				continue;
			}
			if( v >= node.getParent().getBeta()){
				if(node.getChildren().size() > 1){
					if(i + 1 == node.getChildren().size()){
						node.setAlpha(max(node.getAlpha(),v));
						break;
					}
					else{
						for(int j = i + 1; j < node.getChildren().size();j++)
							System.out.println("Skipping expansion of Node " + node.getChild(j).getName() + " because it cannot make beta lower");
						break;						
					}
				}
				else if(node.getChildren().size() == 1){
					node.setAlpha(max(node.getAlpha(),v));
					break;
				}
				return v;
				
			}
			node.setAlpha(max(node.getAlpha(),v));
		}
		//node.getParent().setBeta(min(node.getParent().getBeta(),node.getAlpha()));
		System.out.print("Expanding Max Node " + node.getName() + ": alpha=");
		printExpand(node);
		return v;
	}
	
	public static int minValue(Node node){
		if(node.getChildren().isEmpty())
			return node.getBeta();
		
		if(node.getParent() != null){
			node.setBeta(node.getParent().getBeta());
			node.setAlpha(node.getParent().getAlpha());
		}
		int v = Integer.MAX_VALUE;
		for(int i = 0; i < node.getChildren().size(); i++){
			v = min(v, maxValue(node.getChild(i)));
			if(node.getParent() == null){
				node.setBeta(min(node.getBeta(),v));
				continue;
			}

			//System.out.println(node.getName() + i + " BEFORE " + node.getAlpha() + " " + node.getBeta() + " v=" + v);
			if( v <= node.getParent().getAlpha()){
				//System.out.println(node.getParent().getAlpha());
				//System.out.println("Went in MIN  " + v);
				if(node.getChildren().size() > 1){
					if(i + 1 == node.getChildren().size()){
						node.setBeta(min(node.getBeta(),v));
						break;
					}
					else{
						for(int j = i + 1; j < node.getChildren().size();j++)
							System.out.println("Skipping expansion of Node " + node.getChild(j).getName() + " because it cannot make beta lower");
						break;						
					}
				}
				else if(node.getChildren().size() == 1){
					node.setBeta(min(node.getBeta(),v));
					break;
				}
				return v;
			}
			node.setBeta(min(node.getBeta(),v));
			//System.out.println(node.getName() + " AFTER " + node.getAlpha() + " " + node.getBeta() + " v=" + v);
		}
		//node.getParent().setAlpha(max(node.getParent().getAlpha(),node.getBeta()));
		System.out.print("Expanding Min Node " + node.getName() + ": alpha=");
		printExpand(node);
		return v;
	}
	
	public static int min(int a, int b){
		if(a <= b)
			return a;
		else
			return b;
	}
	
	public static int max(int a, int b){
		if(a >= b)
			return a;
		else
			return b;
	}
	
	public static void printExpand(Node node){
		if(node.getAlpha() == Integer.MIN_VALUE)
			System.out.print("-inf  Beta=");
		else
			System.out.print(node.getAlpha() + "  Beta=");
		if(node.getBeta() == Integer.MAX_VALUE)
			System.out.println("inf");
		else
			System.out.println(node.getBeta()); 
	}
}
