package com.abhishek.ubique_interview.question.one;

import java.util.Date;
import java.util.UUID;

public interface AlertDAO {

	UUID addAlert(Date time);

	Date getAlert(UUID id);

}
