package designPatterns;

//Step 1: Strategy Interface
interface RouteStrategy {
void buildRoute(String start, String end);
}

//Step 2: Concrete Strategies
class CarRoute implements RouteStrategy {
public void buildRoute(String start, String end) {
   System.out.println("Calculating fastest road route from " + start + " to " + end + " by car.");
}
}

class BikeRoute implements RouteStrategy {
public void buildRoute(String start, String end) {
   System.out.println("Finding scenic route from " + start + " to " + end + " by bike.");
}
}

class BusRoute implements RouteStrategy {
public void buildRoute(String start, String end) {
   System.out.println("Finding bus-friendly route from " + start + " to " + end + ".");
}
}

//Step 3: Context Class
class NavigationApp {
private RouteStrategy strategy;

// Allow strategy to be changed at runtime
public void setStrategy(RouteStrategy strategy) {
   this.strategy = strategy;
}

public void navigate(String start, String end) {
   strategy.buildRoute(start, end);
}
}

//Step 4: Client Code
public class StrategyPattern {
public static void main(String[] args) {
   NavigationApp app = new NavigationApp();

   app.setStrategy(new CarRoute());
   app.navigate("Home", "Office");

   app.setStrategy(new BikeRoute());
   app.navigate("Home", "Park");

   app.setStrategy(new BusRoute());
   app.navigate("Home", "Mall");
}
}
