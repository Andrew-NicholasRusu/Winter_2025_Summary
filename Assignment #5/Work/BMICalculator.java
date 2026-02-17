class BMICalculator {
    private double height;
    private double weight;

    public BMICalculator() {
        this.height = 0;
        this.weight = 0;
    }

    public void setHeight(double height) throws HeightOutOfRangeException {
        if (height < 0.2 || height > 2.2) {
            throw new HeightOutOfRangeException("The Height is our of range. It must be between " +
                    "0.2 to 2.2 m. Please try again...");
        }
        this.height = height;
    }

    public void setWeight(double weight) throws WeightOutOfRangeException {
        if (weight < 10 || weight > 300) {
            throw new WeightOutOfRangeException("The Width is out of range. It must be between " +
                    "10 to 300 kg. Please try again...");
        }
        this.weight = weight;
    }

    public String ReturnSingaporeanBMIMeaning() throws NoBMIException {
        if (height == 0 || weight == 0) {
            throw new NoBMIException("BMI cannot be calculated without valid height and weight.");
        }
        double bmi = weight / (height * height);
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 23) return "Normal weight";
        else if (bmi < 27.5) return "Overweight";
        else return "Obese";
    }
}