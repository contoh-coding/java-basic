package gravitasi;

public class KalkulatorGravitasi {
    public static double hitungPosisiAkhir(double fallingTime){
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;

        // rumus untuk hitung posisi akhir
        // x(t) = 0.5 × at^2 + vit + xi
        // x(t) --> Final Position/Posisi Akhir dalam waktu t
        // a    --> gravity / akselerasi (m/s^2) -9.81
        // t    --> Falling time / waktu jatuh 10 detik
        // vi   --> Intial Velocity / Kecepatan mula-mula 0
        // xi   --> Intitial Position / Posisi mula mula 0
        finalPosition = 0.5 * gravity * fallingTime * fallingTime + initialVelocity * fallingTime + initialPosition;
        // finalPosition = 0.5 * gravity * Math.pow(fallingTime, 2)  + initialVelocity * fallingTime + initialPosition;
        
        return finalPosition;
    }
}
