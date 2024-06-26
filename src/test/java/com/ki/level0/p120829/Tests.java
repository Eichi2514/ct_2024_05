package com.ki.level0.p120829;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("70 = 1")
    void t1() {
        assertThat(new Solution().solution(70)).isEqualTo(1);
    }

    @Test
    @DisplayName("91 = 3")
    void t2() {
        assertThat(new Solution().solution(91)).isEqualTo(3);
    }
    @Test
    @DisplayName("180 = 4")
    void t3() {
        assertThat(new Solution().solution(180)).isEqualTo(4);
    }
}
