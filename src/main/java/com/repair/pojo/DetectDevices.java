package com.repair.pojo;

public class DetectDevices {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_DetectDevices.device_id
     *
     * @mbggenerated
     */
    private Integer deviceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_DetectDevices.detect_number
     *
     * @mbggenerated
     */
    private Integer detectNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_DetectDevices.state
     *
     * @mbggenerated
     */
    private Byte state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_DetectDevices.mark
     *
     * @mbggenerated
     */
    private String mark;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_DetectDevices
     *
     * @mbggenerated
     */
    public DetectDevices(Integer deviceId, Integer detectNumber, Byte state, String mark) {
        this.deviceId = deviceId;
        this.detectNumber = detectNumber;
        this.state = state;
        this.mark = mark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_DetectDevices
     *
     * @mbggenerated
     */
    public DetectDevices() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_DetectDevices.device_id
     *
     * @return the value of tb_DetectDevices.device_id
     *
     * @mbggenerated
     */
    public Integer getDeviceId() {
        return deviceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_DetectDevices.device_id
     *
     * @param deviceId the value for tb_DetectDevices.device_id
     *
     * @mbggenerated
     */
    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_DetectDevices.detect_number
     *
     * @return the value of tb_DetectDevices.detect_number
     *
     * @mbggenerated
     */
    public Integer getDetectNumber() {
        return detectNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_DetectDevices.detect_number
     *
     * @param detectNumber the value for tb_DetectDevices.detect_number
     *
     * @mbggenerated
     */
    public void setDetectNumber(Integer detectNumber) {
        this.detectNumber = detectNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_DetectDevices.state
     *
     * @return the value of tb_DetectDevices.state
     *
     * @mbggenerated
     */
    public Byte getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_DetectDevices.state
     *
     * @param state the value for tb_DetectDevices.state
     *
     * @mbggenerated
     */
    public void setState(Byte state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_DetectDevices.mark
     *
     * @return the value of tb_DetectDevices.mark
     *
     * @mbggenerated
     */
    public String getMark() {
        return mark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_DetectDevices.mark
     *
     * @param mark the value for tb_DetectDevices.mark
     *
     * @mbggenerated
     */
    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }
}