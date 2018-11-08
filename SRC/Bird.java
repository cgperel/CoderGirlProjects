import java.util.Date;

/**
 * Tracks a single experimental trial in puzzle-solving in birds.  A piece of food,
 * such as a nut, is floated in a beaker of water.  The bird must add rocks or twigs
 * to the beaker to raise the water level so it can reach the treat.  The experiment
 * measures change in water level and whether the bird successfully extracted the treat.
 */
public class Bird {
    Date experimentDate;
    String experimentType;
    int trialCategory;
    int trialNumber;
    boolean birdSuccessfulExtractingFood;
    float waterLevelBefore;
    float waterLevelAfter;
    String notes;

    public Bird()
    {
    }
    public Date getExperimentDate()
    {
        return experimentDate;
    }
    public String getExperimentType()
    {
        return experimentType;
    }
    public int getTrialCategory()
    {
        return trialCategory;
    }
    public int getTrialNumber()
    {
        return trialNumber;
    }
    public boolean isBirdSuccessfulExtractingFood()
    {
        return birdSuccessfulExtractingFood;
    }
    public float getWaterLevelBefore()
    {
        return waterLevelBefore;
    }
    public float getWaterLevelAfter()
    {
        return waterLevelAfter;
    }
        // Complete the class by adding methods so that it is a valid java bean.
        // Then check your work against the provided solution.
    public void setExperimentDate(Date experimentDate){
        this.experimentDate=experimentDate;
    }
    public void setExperimentType(String experimentType){
        this.experimentType=experimentType;
    }
    public void setTrialCategory(int trialCategory){
        this.trialCategory=trialCategory;
    }
    public void setTrialNumber(int trialNumber){
        this.trialNumber=trialNumber;
    }
    public void setBirdSuccessfulExtractingFood(boolean birdSuccessfulExtractingFood){
        this.birdSuccessfulExtractingFood=birdSuccessfulExtractingFood;
    }
    public void setWaterLevelBefore(float waterLevelBefore){
        this.waterLevelBefore=waterLevelBefore;
    }
    public void setWaterLevelAfter(float waterLevelAfter){
        this.waterLevelAfter=waterLevelAfter;
    }
}
