package net.skhu.student.dto.request;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EnrollmentSaveRequestDto {
    private Long studentId;
    private Long lectureId;
}
