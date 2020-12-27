create
    definer = root@localhost procedure proc_updateCourse(IN V_ID varchar(255), IN V_NAME varchar(255),
                                                         IN V_MID varchar(255), IN V_PERIOD int, IN V_CREDIT double)
BEGIN
update course set COUR_NAME=V_NAME,MAJOR_ID=V_MID,COUR_PERIOD=V_PEROID,COUR_CREDIT=V_CREDIT where COUR_ID=V_ID;
END;

