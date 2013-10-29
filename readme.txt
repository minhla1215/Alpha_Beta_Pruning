Name: Minh La
ID: 3545124759
Email: minht@usc.edu

Project Name: Alpha Beta Pruning

1. Brief description:
This project is made for USC AI 460. This program uses the alpha beta pruning algorithm utilizing Min and Max. The program is a recursive function finds the max or min of the children nodes so maximize the best path to take.
The program also looks at the children of the node and see if they could improve the solution at all. If they do not, the node and their children are skipped. This would make the algorithm much faster.

2. How to compile:
using aludra/UNIX:
1. unzip the files
2. Use Filezilla or file transfer to put onto aludra/UNIX
3. go to file and call - 
      javac *.java
4. then enter
      java A3
5. The results should be in the console (since output were not statement in the assignment)
Results contain:
Expanding min/max node <name>: alpha= ?  beta == ?
Expanding min/max node <name>: alpha= ?  beta == ?
Expanding min/max node <name>: alpha= ?  beta == ?
Skipping expansion of Node <name> because it cannot make beta lower

     
Value of Max Node A = ?

Move that Max Node A would make is = <name>


For the output of this program, I did it dfs. So I output d0, d1, etc and a0 last. This is the opposite of what the sample output says but it makes sense because I am getting that node outputting the new updated value each time. 
The other approach would not get any value and the solution would be not necessarily correct. Also, by outputting it with dfs, I can see which node I skip and also where it currently is.
 
My answers to the questions:
1. The alpha beta pruning would improve the results because it would decrease the processing time since alpha beta pruning would prune (skip) the unnecessary moves that will not affect the solution. 
As to making changes to the tree, I would consider reordering the tree. This would greatly improve the time it takes to find the answer and could lead to a processing time of b(m/2) instead of b(m). As for the reordering, I do not know exactly which reordering will work best, but possibly sorting the tree.

2. If it utilizes the alpha beta pruning algorithm, it would be able to increase the depth to 2d. This is because the algorithm decreases the processing time to b(d/2), which in turn allows the program to search deeper twice as deep, to a maximum of 2d.