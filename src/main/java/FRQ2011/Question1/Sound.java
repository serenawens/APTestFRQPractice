package FRQ2011.Question1;
//TIme Taken: 15 minutes
public class Sound {
    /** the array of values in this sound; guaranteed not to be null */
    private int[] samples;

    public Sound(int[] samples) {
        this.samples = samples;
    }

    public int[] getSamples() {
        return samples;
    }

    /** Changes those values in this sound that have an amplitude greater than limit.
     * Values greater than limit are changed to limit.
     * Values less than -limit are changed to -limit.
     * @param limit the amplitude limit
     * Precondition: limit ≥ 0
     * @return the number of values in this sound that this method changed*/
    public int limitAmplitude(int limit)
    {
        int changed =0;
        for (int amplitude: samples)
        {
            if(amplitude>0 && amplitude>limit)
            {
                amplitude = limit;
                changed++;
            }
            else if(amplitude<0 && amplitude<(limit*-1))
            {
                amplitude= limit*-1;
                changed++;
            }
        }
        return changed;
    }

    /** Removes all silence from the beginning of this sound.
     * Silence is represented by a value of 0.
     * Precondition: samples contains at least one nonzero value
     * Postcondition: the length of samples reflects the removal of starting silence*/
    public void trimSilenceFromBeginning()
    {
        int numberTrimmed=0;
        int i=0;
        while(samples[i]==0)
        {
            numberTrimmed++;
            i++;
        }
        int[] trimmedSound = new int[samples.length-numberTrimmed];
        for(int j=numberTrimmed; j<samples.length; j++)
        {
            trimmedSound[j-numberTrimmed] = samples[j];
        }
    }
}
