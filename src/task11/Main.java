package task11;

class Main {
   public static void main(String[] args) {

      // 1.2 Создаём экземпляры роботов
      RobotCook cook = new RobotCook("ChefPro-1000", 250, "Германия", "мультифункциональный кухонный модуль");
      RobotBuilder builder = new RobotBuilder("BuildMaster-2000", 320, "Япония", "3D-принтер", "цемент");
      RobotSapper sapper = new RobotSapper("MineBot-500", 180, 654, "титан");

      System.out.println("Ремонт роботов:");
      cook.repairRobot();
      builder.repairRobot();
      sapper.repairRobot();

      System.out.println();

      Robot[] exhibitionAllRobots = {cook, builder, sapper};
      RobotEngineer[] exhibitionEngineers = {builder, sapper};
      RobotSapper[] exhibitionMineRobots = {sapper};


      for (Robot robot : exhibitionAllRobots) {
         robot.turnOn();
      }


      System.out.println("Выставка всех роботов: демонстрация способностей");
      for (Robot robot : exhibitionAllRobots) {
         robot.uniquePossibility();
      }

      System.out.println();


      System.out.println("Выставка роботов-инженеров: создание предметов");
      for (RobotEngineer engineer : exhibitionEngineers) {
         engineer.createItem();
      }

      System.out.println();


      System.out.println("Выставка роботов-сапёров: демонстрация способностей");
      for (RobotSapper mineRobot : exhibitionMineRobots) {
         mineRobot.uniquePossibility();
      }


      for (Robot robot : exhibitionAllRobots) {
         robot.turnOff();
      }
   }
}
