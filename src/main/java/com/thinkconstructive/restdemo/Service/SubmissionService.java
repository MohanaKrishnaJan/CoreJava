package com.thinkconstructive.restdemo.Service;

import com.thinkconstructive.restdemo.entity.SubmissionDTO;

import java.util.List;

public interface SubmissionService {
    SubmissionDTO getSubmission(String id);

    SubmissionDTO addSubmission(SubmissionDTO submission);

    SubmissionDTO updateSubmission(SubmissionDTO submission);

    boolean deleteSubmission(String id);

    List<SubmissionDTO> getAll();
}