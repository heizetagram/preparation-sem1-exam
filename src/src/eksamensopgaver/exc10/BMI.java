package eksamensopgaver.exc10;

public class BMI {
    private double height;
    private double weight;
    private double bmi;

    public BMI(double height, double weight) {
        setHeight(height);
        setWeight(weight);
        calculateBMI();
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
    public double getHeight() {
        return height;
    }

    private void calculateBMI() {
        bmi = weight / (Math.pow(height, 2));
        bmi = Math.round(bmi);
        System.out.println("BMI: " + bmi);
    }

    public boolean isUnderWeight() {
        return bmi < 18.5;
    }

    public boolean isOverWeight() {
        return bmi > 25;
    }

    public boolean isNormalWeight() {
        return bmi > 18.5 && bmi < 25;
    }




}
