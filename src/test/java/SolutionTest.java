import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SolutionTest {
    Solution solution;

    @BeforeAll
    void 세팅() {
        solution = new Solution();
    }
    @Test
    @Order(1)
    void 테스트케이스1() {
        assertThat(solution.calculater("RLRRLLRLRL")).isEqualTo(4);
    }
    @Test
    @Order(2)
    void 테스트케이스2() {
        assertThat(solution.calculater("RLRRRLLRLL")).isEqualTo(2);
    }
    @Test
    @Order(3)
    void 테스트케이스3() {
        assertThat(solution.calculater("LLLLRRRR")).isEqualTo(1);
    }

}
