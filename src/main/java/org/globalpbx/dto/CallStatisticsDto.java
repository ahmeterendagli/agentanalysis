package org.globalpbx.dto;

public class CallStatisticsDto {
    private double average = 0;
    private double sum = 0;
    private double max = 0;
    private double min = 0;

    public CallStatisticsDto() {
    }

    public CallStatisticsDto(double average, double sum, double max, double min) {
        this.average = average;
        this.sum = sum;
        this.max = max;
        this.min = min;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    @Override
    public String toString() {
        return "CallStatisticsDto{" +
                "average=" + average +
                ", sum=" + sum +
                ", max=" + max +
                ", min=" + min +
                '}';
    }
}
