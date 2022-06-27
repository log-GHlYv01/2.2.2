public class Car extends MultiWheeledTransport implements Serviceble {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    private void updateTyre() {
        System.out.println("Меняем легковую покрышку ");
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель легковой ");
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }
}
