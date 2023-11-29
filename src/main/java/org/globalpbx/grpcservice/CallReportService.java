package org.globalpbx.grpcservice;

import io.grpc.stub.StreamObserver;
import org.globalpbx.dto.CallReportDto;
import org.globalpbx.dto.CallStatisticsDto;
import org.globalpbx.repository.AgentRepository;

import java.util.List;

public class CallReportService extends CallReportGrpc.CallReportImplBase {

    private final AgentRepository agentRepository;

    public CallReportService(AgentRepository agentRepository) {
        this.agentRepository = agentRepository;
    }


    @Override
    public void save(CallReport.CallReportInfo request, StreamObserver<CallReport.SResult> responseObserver) {

        try {
            agentRepository.connect();
            agentRepository.createAgentTable();
            agentRepository.addAgentInfo(request);
        } catch (Exception e) {
            e.printStackTrace();
        }
        CallReport.SResult.Builder response = new CallReport.SResult.Builder();

        response.setResponseCode(0).setResponsemessage("Success");
        System.out.println(responseObserver);
        if (responseObserver != null) {
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
        }
    }

    @Override
    public void getAverageCallAnswerToEndSeconds(CallReport.Empty request, StreamObserver<CallReport.SResult> responseObserver) {
        CallStatisticsDto callStatisticsDto = new CallStatisticsDto();
        try {
            agentRepository.connect();
            agentRepository.createAgentTable();
            List<CallReportDto> allCallReport = agentRepository.getAllCallReport();
            List<Long> talkTimes = allCallReport.stream()
                    .map(CallReportDto::getCallanswertoendseconds)
                    .toList();

            callStatisticsDto.setAverage(talkTimes.stream().mapToDouble(Long::longValue).average().orElse(0));
            callStatisticsDto.setSum(talkTimes.stream().mapToDouble(Long::longValue).sum());
            callStatisticsDto.setMax(talkTimes.stream().mapToDouble(Long::longValue).max().orElse(0));
            callStatisticsDto.setMin(talkTimes.stream().mapToDouble(Long::longValue).min().orElse(0));

        } catch (Exception e) {
            e.printStackTrace();
        }
        CallReport.SResult.Builder response = new CallReport.SResult.Builder();

        response.setResponseCode(0).setResponsemessage(callStatisticsDto.toString());
        System.out.println(responseObserver);
        if (responseObserver != null) {
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
        }
    }
}
