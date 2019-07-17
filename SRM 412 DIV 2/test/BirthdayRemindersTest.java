import org.junit.Test;
import static org.junit.Assert.*;

public class BirthdayRemindersTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] friendNames = new String[] {"John", "Jack", "Bill"};
		int[] birthDates = new int[] {50, 100, 150};
		int currentDate = 500;
		String[] occasions = new String[] {"birthday", "decimal birthday", "binary birthday"};
		int[] days = new int[] {365, 1000, 512};
		int k = 10;
		assertArrayEquals(new String[] {"515. Bill birthday (1)", "562. John binary birthday (1)", "612. Jack binary birthday (1)", "662. Bill binary birthday (1)", "780. John birthday (2)", "830. Jack birthday (2)", "880. Bill birthday (2)", "1050. John decimal birthday (1)", "1074. John binary birthday (2)", "1100. Jack decimal birthday (1)" }, new BirthdayReminders().remind(friendNames, birthDates, currentDate, occasions, days, k));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] friendNames = new String[] {"Zero", "Two", "Three"};
		int[] birthDates = new int[] {0, 2, 3};
		int currentDate = 24;
		String[] occasions = new String[] {"threeday", "twoday"};
		int[] days = new int[] {3,2};
		int k = 10;
		assertArrayEquals(new String[] {"24. Zero threeday (8)", "24. Three threeday (7)", "24. Zero twoday (12)", "24. Two twoday (11)", "25. Three twoday (11)", "26. Two threeday (8)", "26. Zero twoday (13)", "26. Two twoday (12)", "27. Zero threeday (9)", "27. Three threeday (8)" }, new BirthdayReminders().remind(friendNames, birthDates, currentDate, occasions, days, k));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] friendNames = new String[] {"Jessica Alba", "Angelina Jolie", "Paris Hilton", "Britney Spears"};
		int[] birthDates = new int[] {4135, 1980, 4065, 4353};
		int currentDate = 14091;
		String[] occasions = new String[] {"Venus year", "Earth year", "Mars year", "Jupiter year", "Saturn year"};
		int[] days = new int[] {225, 365, 687, 4332, 10760};
		int k = 20;
		assertArrayEquals(new String[] {"14130. Angelina Jolie Venus year (54)", "14190. Paris Hilton Venus year (45)", "14208. Britney Spears Earth year (27)", "14253. Britney Spears Venus year (44)", "14260. Jessica Alba Venus year (45)", "14285. Paris Hilton Earth year (28)", "14346. Angelina Jolie Mars year (18)", "14355. Angelina Jolie Venus year (55)", "14355. Jessica Alba Earth year (28)", "14370. Paris Hilton Mars year (15)", "14390. Angelina Jolie Earth year (34)", "14415. Paris Hilton Venus year (46)", "14440. Jessica Alba Mars year (15)", "14478. Britney Spears Venus year (45)", "14485. Jessica Alba Venus year (46)", "14573. Britney Spears Earth year (28)", "14580. Angelina Jolie Venus year (56)", "14640. Paris Hilton Venus year (47)", "14650. Paris Hilton Earth year (29)", "14658. Britney Spears Mars year (15)" }, new BirthdayReminders().remind(friendNames, birthDates, currentDate, occasions, days, k));
	}

	@Test(timeout=2000) //439ms in Topcoder
	public void test3() {
		String[] friendNames = new String[]{"A", "B", "C", "D", "E", "F", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y"};
		int[] birthDates = new int[]{42, 18468, 6335, 26501, 19170, 15725, 11479, 29359, 26963, 24465, 5706, 28146, 23282, 16828, 9962, 492, 2996, 11943, 4828, 5437, 32392, 14605, 3903, 154, 293, 12383, 17422, 18717, 19719, 19896, 5448, 21727, 14772, 11539, 1870, 19913, 25668, 26300, 17036, 9895, 28704, 23812, 31323, 30334, 17674, 4665, 15142, 7712, 28254, 6869};
		int currentDate = 1000000;
		String[] occasions = new String[]{"A", "B", "C", "D", "E", "F", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y"};

		int[] days = new int[]{25548, 27645, 32663, 32758, 20038, 12860, 8724, 9742, 27530, 779, 12317, 3036, 22191, 1843, 289, 30107, 9041, 8943, 19265, 22649, 27447, 23806, 15891, 6730, 24371, 15351, 15007, 31102, 24394, 3549, 19630, 12624, 24085, 19955, 18757, 11841, 4967, 7377, 13932, 26309, 16945, 32440, 24627, 11324, 5538, 21539, 16119, 2083, 22930, 16542};

		int k = 100;
		assertArrayEquals(new String[]{"1000002. b Y (146)", "1000004. o K (1271)", "1000004. O w (472)", "1000006. J L (79)", "1000006. O P (3402)", "1000006. Y W (42)", "1000007. d P (3392)", "1000008. B K (1260)", "1000009. o P (3426)", "1000014. h X (62)", "1000019. C I (102)", "1000022. b P (3400)", "1000026. J P (3367)", "1000030. H K (1269)", "1000031. h w (473)", "1000033. p P (3361)", "1000033. D l (196)", "1000034. S P (3419)", "1000035. S V (36)", "1000035. Z o (38)", "1000036. E P (3394)", "1000037. I w (466)", "1000040. W K (1265)", "1000046. R P (3450)", "1000048. T B (36)", "1000048. T O (540)", "1000048. Z p (59)", "1000050. m K (1250)", "1000051. r P (3352)", "1000053. M P (3363)", "1000054. q P (3378)", "1000054. v P (3408)", "1000055. C e (280)", "1000057. i m (134)", "1000059. R O (541)", "1000059. F P (3406)", "1000064. m m (132)", "1000066. o e (279)", "1000067. J O (528)", "1000071. P K (1271)", "1000072. N O (530)", "1000074. W R (109)", "1000076. P P (3426)", "1000076. j P (3454)", "1000081. U k (84)", "1000086. X P (3447)", "1000087. O v (61)", "1000090. i K (1269)", "1000092. T c (32)", "1000092. f k (84)", "1000094. y K (1275)", "1000094. Y P (3460)", "1000095. W P (3410)", "1000102. N P (3380)", "1000109. n e (277)", "1000110. I P (3359)", "1000115. o F (77)", "1000116. R K (1280)", "1000117. p K (1247)", "1000122. e t (177)", "1000129. K P (3376)", "1000132. h L (80)", "1000133. P e (279)", "1000133. Z w (480)", "1000134. n K (1262)", "1000138. w P (3434)", "1000138. t a (64)", "1000139. k t (177)", "1000142. D P (3369)", "1000143. Q P (3459)", "1000144. T P (3444)", "1000145. Z W (42)", "1000148. N K (1254)", "1000148. H P (3421)", "1000151. g K (1256)", "1000155. a K (1268)", "1000155. L P (3441)", "1000158. w K (1274)", "1000161. c P (3396)", "1000161. x P (3363)", "1000162. b D (30)", "1000162. y P (3437)", "1000163. J q (30)", "1000164. m s (86)", "1000175. U P (3442)", "1000176. l P (3372)", "1000182. P F (77)", "1000183. I A (38)", "1000184. e P (3392)", "1000185. a P (3418)", "1000186. f P (3442)", "1000189. s K (1245)", "1000189. t T (51)", "1000194. M g (77)", "1000195. d O (532)", "1000196. A d (41)", "1000197. l K (1251)", "1000200. r e (273)", "1000201. B P (3397)", "1000201. k P (3392)"}
				, new BirthdayReminders().remind(friendNames, birthDates, currentDate, occasions, days, k));


	}
}
