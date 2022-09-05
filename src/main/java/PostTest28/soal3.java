package PostTest28;

public class soal3 {
	
	public static void main(String[] args) {
		String[] Trailer = {":T1:202112SOAL3", ":T2:SOAL3/2112/AB000000011 OD:0001234500CDE5432100 SOAL003 ABCDE12345 XAS SKILL TEST ESSAY .DT",
                ":T1:202111SOAL3", ":T2:SOAL3/2111/BC000011100 OD:0003452100EFG2451300 SOAL003 EFGHI25134 XAS SKILL TEST ESSAY .DT",
                ":T1:202110SOAL3", ":T2:SOAL3/2110/DE210031010 OD:0001524300HIJ2145300 SOAL003 JKLMN52431 XAS SKILL TEST ESSAY .DT"};

        String ambilTrailer1T1 = Trailer[0].substring(0);
        String ambilTrailer1T2 = Trailer[1].substring(0,4);
        String ambil1Trailer1T2 = Trailer[1].substring(40);
        String ambil2Trailer1T2 = Trailer[1].substring(3,40);

        System.out.println(ambilTrailer1T1);
        System.out.print(ambilTrailer1T2);
        System.out.print(ambil1Trailer1T2);
        System.out.println(ambil2Trailer1T2);
        System.out.println("");

        String ambilTrailer2T1 = Trailer[2].substring(0);
        String ambilTrailer2T2 = Trailer[3].substring(0,4);
        String ambil1Trailer2T2 = Trailer[3].substring(40);
        String ambil2Trailer2T2 = Trailer[3].substring(3,40);

        System.out.println(ambilTrailer2T1);
        System.out.print(ambilTrailer2T2);
        System.out.print(ambil1Trailer2T2);
        System.out.println(ambil2Trailer2T2);
        System.out.println("");

        String ambilTrailer3T1 = Trailer[4].substring(0);
        String ambilTrailer3T2 = Trailer[5].substring(0,4);
        String ambil1Trailer3T2 = Trailer[5].substring(40);
        String ambil2Trailer3T2 = Trailer[5].substring(3,40);

        System.out.println(ambilTrailer3T1);
        System.out.print(ambilTrailer3T2);
        System.out.print(ambil1Trailer3T2);
        System.out.println(ambil2Trailer3T2);

	}

}
