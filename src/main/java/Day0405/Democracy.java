package Day0405;

final class Democracy {
    final int votes = 150;

    final void verdict(){
        System.out.println(votes + " needed for final verdict and " + (int)(0.75*150) + " votes enough to win");
    }
}
