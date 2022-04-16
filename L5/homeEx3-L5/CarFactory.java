public class CarFactory {
    public Car getCar(String carType){
        if(carType == null){
            return null;
        }
        if(carType.equalsIgnoreCase("KIA")){
            return new Kia();

        } else if(carType.equalsIgnoreCase("TOYOTA")){
            return new Toyota();

        } else if(carType.equalsIgnoreCase("RENAULT")){
            return new Renault();

        }else if(carType.equalsIgnoreCase("BMW")){
            return new BMW();
        }

        return null;
    }
}
