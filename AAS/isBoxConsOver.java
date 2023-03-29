package AAS;
//You take a Box class or IsBoxConsOver anything you want
class isBoxConsOver {
    double width, height, depth;
    
    //this is 1st constructor
    isBoxConsOver(Double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    //this is seconnd constructor for overriding
    isBoxConsOver(){
        width = height = depth = 0;
    }
    //this is seconnd constructor for overriding
    isBoxConsOver(double len){
        width = height = depth = len;
    }
    //make a mathod for output
    double volume(){
        return width * height * depth;
    }
    // go to the test5.java
}

