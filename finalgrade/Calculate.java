public class Calculate
{
  public double currentGrade;
  public double wantedGrade;
  public double examWeight;

  public Calculate(double currentGrade, double wantedGrade, double examWeight) 
  {
    this.currentGrade = currentGrade;
    this.wantedGrade = wantedGrade;
    this.examWeight = examWeight;
    
  }
  public double calc() {
    return ((this.wantedGrade - (1.0 - this.examWeight)*this.currentGrade)) / this.examWeight * 100;
  }
}
