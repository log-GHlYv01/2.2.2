public class Truck extends MultiWheeledTransport implements Serviceble{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    private void updateTyre() {
        System.out.println("Меняем покрышку грузовую");
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель грузовой");
    }

    private void checkTrailer() {
        System.out.println("Проверяем прицеп грузовой");
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();
    }
}