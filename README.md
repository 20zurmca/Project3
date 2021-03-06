# Project Description
<b> Final Project for CS150: Data Structures and Algorithms </b>

This project presented the travelling salesman problem.  The problem asks from a single vertex in a connected graph, what is the shortest path to every other vertex and back, with a nuance.  The context involves shops and warehouses on a 100x100 connected grid (a weighted, directed graph).  The shops and warehouses serve as vertices, and edges connect every shop and warehouse together with weight equal to their distance apart.  The shops have cargo orders that delivery trucks need to satisfy in one day; however, the trucks cannot load past 500 units of cargo.  If a truck fills to this capacity, it must return to its originating warehouse.  Each truck must deliver a full cargo-order for a specific cargo, and there are five different types of cargo.  The number of trucks per warehouse varies, and there exists one “master warehouse” at the edge of the grid with unlimited trucks.  The objective of the project is to minimize the travelling distance of all trucks while satisfying all the shops. This problem is NP-hard, meaning it cannot be solved in polynomial time.  Thus, I took a greedy approach in solving the problem.  In my analysis, I will analyze the efficiency of my optimization.  My hypothesis is that my solution is efficient in most cases.

In my solution, I mapped the shops and warehouses on a weighted, directed graph.  Every shop is connected to every other shop and warehouse with edge weights equal to their total horizontal and vertical separation distance.  Each warehouse has a stack of trucks of varying quanity.  The general idea is that once a truck leaves a warehouse, the truck will go to the closest possible shop and fulfill all its needs.  There are three checks that happen before a truck can go to a shop (which is part of my greedy algorithm).  First, a truck can only go to a shop if it can fulfill the cargo needs of that shop (a numeric comparison).  Second, the truck can’t go to the same shop twice.  Last, a truck can’t go to a shop if there is a warehouse closer to that shop than the truck's current position.  This last condition only applies to trucks that have visited at least one shop, so every warehouse (besides the master one, of course) is guarenteed to use all of their trucks.  If any of these checks fail, the truck will go to the next closest shop to fulfill those needs.  The truck will continue this algorithm until it is either full or it has seen every prior shop.  Then, it will return to its originating warehouse.  To find the closest shop, I store all neighboring facilities to a given shop in an ArrayList and sort them by edge-weight (distance).  I dispatch one truck at a time, one warehouse at a time, starting with the first warehouse, the second warehouse, and so on to the tenth warehouses.  When the first nine warehouses run out of trucks, I only use the master warehouse, which has unlimited trucks.  Last, I sorted each shop’s cargo order by weight largest to smallest, so each truck will pick up the shops’ largest orders first.    

<b>To run on terminal type java Delivery "shops.txt" "warehouses1.txt" or java Delivery "shops.txt" "warehouses2.txt" after compiling</b>

The Professor gave a semi-optimized solution to this problem and came to a total traveled distance of ~13,000 distance units for all shops to be satisfied. Our algorithm reached 12190 units, a substantial immprovement. The <a href = https://github.com/20zurmca/Optimizing_Traveling_Salesman/blob/master/Project%20Report.pdf> report </a> outlines more detail.

<p>Click <a href = https://github.com/20zurmca/Optimizing_Traveling_Salesman/blob/master/grade.pdf> here </a> for project grade </p>
<p>Click <a href = https://github.com/20zurmca/Optimizing_Traveling_Salesman/blob/master/projectExplanation.pdf> here </a> for official project proposal </p>

## Demo
<p><b> Launching the program </b></p>
<img src = "https://github.com/20zurmca/Optimizing_Traveling_Salesman/blob/master/Demo/args.PNG" alt = "Command Line Demonstration" height = 24 />

<p><b> Running the simulation (abbreviated) </b></p>
<img src = "https://github.com/20zurmca/Optimizing_Traveling_Salesman/blob/master/Demo/simulation.PNG" alt = "Running Simulation" />

<p><b> Acquiring Results </b></p>
<img src = "https://github.com/20zurmca/Optimizing_Traveling_Salesman/blob/master/Demo/Results.PNG" alt = "Acquired Results" />


