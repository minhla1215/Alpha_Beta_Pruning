
public class Tree {
	Node a0;
	Node [] b = new Node[2];
	Node [] c = new Node[5];
	Node [] d = new Node[10];
	Node [] e = new Node[15];

	public Tree(){
		a0 = new Node(null, "a0",Integer.MIN_VALUE, Integer.MAX_VALUE);
		
		// for b
		for(int i = 0; i < b.length;i++){
			b[i] = new Node(a0, "b" + i, Integer.MIN_VALUE, Integer.MAX_VALUE);
			a0.addChild(b[i]);
		}
		
		// for c0 - c2
		c[0] = new Node(b[0], "c0", Integer.MIN_VALUE, Integer.MAX_VALUE);
		c[1] = new Node(b[0], "c1", 5, Integer.MAX_VALUE);
		c[2] = new Node(b[0], "c2", Integer.MIN_VALUE, Integer.MAX_VALUE);
		for(int i = 0; i <= 2;i++){
			b[0].addChild(c[i]);
		}
		
		//for c3-c4
		for(int i = 3; i <= 4;i++){
			c[i] = new Node(b[1], "c" + i, Integer.MIN_VALUE, Integer.MAX_VALUE);
			b[1].addChild(c[i]);
		}
		
		// for d
		for(int i = 0; i <= 2;i++){
			d[i] = new Node(c[0], "d" + i, Integer.MIN_VALUE, Integer.MAX_VALUE);
			c[0].addChild(d[i]);
		}
		
		d[3] = new Node(c[2], "d3", Integer.MIN_VALUE, Integer.MAX_VALUE);
		d[4] = new Node(c[2], "d4", Integer.MIN_VALUE, Integer.MAX_VALUE);
		c[2].addChild(d[3]);
		c[2].addChild(d[4]);
		
		d[5] = new Node(c[3], "d5", Integer.MIN_VALUE, Integer.MAX_VALUE);
		d[6] = new Node(c[3], "d6", Integer.MIN_VALUE,-3);
		c[3].addChild(d[5]);
		c[3].addChild(d[6]);
		
		d[7] = new Node(c[4], "d7", Integer.MIN_VALUE, Integer.MAX_VALUE);
		d[8] = new Node(c[4], "d8", Integer.MIN_VALUE, Integer.MAX_VALUE);
		d[9] = new Node(c[4], "d9", Integer.MIN_VALUE, 8);
		c[4].addChild(d[7]);
		c[4].addChild(d[8]);
		c[4].addChild(d[9]);
		
		// for e
		e[0] = new Node(d[0], "e0", 3, Integer.MAX_VALUE);
		e[1] = new Node(d[0], "e1", -2, Integer.MAX_VALUE);
		e[2] = new Node(d[0], "e2", 1, Integer.MAX_VALUE);
		d[0].addChild(e[0]);
		d[0].addChild(e[1]);
		d[0].addChild(e[2]);
		
		e[3] = new Node(d[1], "e3", -6, Integer.MAX_VALUE);
		d[1].addChild(e[3]);
		
		e[4] = new Node(d[2], "e4", 1, Integer.MAX_VALUE);
		e[5] = new Node(d[2], "e5", -5, Integer.MAX_VALUE);
		d[2].addChild(e[4]);
		d[2].addChild(e[5]);
		
		e[6] = new Node(d[3], "e6", 4, Integer.MAX_VALUE);
		d[3].addChild(e[6]);
		
		e[7] = new Node(d[4], "e7", 2, Integer.MAX_VALUE);
		e[8] = new Node(d[4], "e8", 0, Integer.MAX_VALUE);
		d[4].addChild(e[4]);
		d[4].addChild(e[5]);
		
		e[9] = new Node(d[5], "e9", 7, Integer.MAX_VALUE);
		e[10] = new Node(d[5], "e10", 2, Integer.MAX_VALUE);
		d[5].addChild(e[9]);
		d[5].addChild(e[10]);
		
		e[11] = new Node(d[7], "e11", 3, Integer.MAX_VALUE);
		d[7].addChild(e[11]);
		
		e[12] = new Node(d[8], "e12", 6, Integer.MAX_VALUE);
		e[13] = new Node(d[8], "e13", 1, Integer.MAX_VALUE);
		e[14] = new Node(d[8], "e14", 2, Integer.MAX_VALUE);
		d[8].addChild(e[12]);
		d[8].addChild(e[13]);
		d[8].addChild(e[14]);
	}
	
	public Node getRoot(){
		return a0;
	}
	
}

