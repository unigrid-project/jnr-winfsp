package com.github.jnrwinfspteam.jnrwinfsp;

import com.github.jnrwinfspteam.jnrwinfsp.api.*;
import com.github.jnrwinfspteam.jnrwinfsp.internal.struct.FSP_FILE_SYSTEM;
import jnr.ffi.Pointer;

import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

/**
 * Extend this class and override only the operations you wish to implement. The remaining operations
 * will never be called.
 */
public class WinFspStubFS extends AbstractWinFspFS {

    @Override
    @NotImplemented
    public VolumeInfo getVolumeInfo(FSP_FILE_SYSTEM fileSystem) throws NTStatusException {
        return null;
    }

    @Override
    @NotImplemented
    public VolumeInfo setVolumeLabel(FSP_FILE_SYSTEM fileSystem, String volumeLabel) throws NTStatusException {
        return null;
    }

    @Override
    @NotImplemented
    public Optional<SecurityResult> getSecurityByName(FSP_FILE_SYSTEM fileSystem, String fileName) throws NTStatusException {
        return null;
    }

    @Override
    @NotImplemented
    public FileInfo create(FSP_FILE_SYSTEM fileSystem,
                           String fileName,
                           Set<CreateOptions> createOptions,
                           int grantedAccess,
                           Set<FileAttributes> fileAttributes,
                           byte[] securityDescriptor,
                           long allocationSize,
                           ReparsePoint reparsePoint) throws NTStatusException {
        return null;
    }

    @Override
    @NotImplemented
    public FileInfo open(FSP_FILE_SYSTEM fileSystem,
                         String fileName,
                         Set<CreateOptions> createOptions,
                         int grantedAccess) throws NTStatusException {
        return null;
    }

    @Override
    @NotImplemented
    public FileInfo overwrite(FSP_FILE_SYSTEM fileSystem,
                              String fileName,
                              Set<FileAttributes> fileAttributes,
                              boolean replaceFileAttributes,
                              long allocationSize) throws NTStatusException {
        return null;
    }

    @Override
    @NotImplemented
    public void cleanup(FSP_FILE_SYSTEM fileSystem, OpenContext ctx, Set<CleanupFlags> flags) {

    }

    @Override
    @NotImplemented
    public void close(FSP_FILE_SYSTEM fileSystem, OpenContext ctx) {

    }

    @Override
    @NotImplemented
    public long read(FSP_FILE_SYSTEM fileSystem,
                     String fileName,
                     Pointer pBuffer,
                     long offset,
                     int length) throws NTStatusException {
        return 0;
    }

    @Override
    @NotImplemented
    public WriteResult write(FSP_FILE_SYSTEM fileSystem,
                             String fileName,
                             Pointer pBuffer,
                             long offset,
                             int length,
                             boolean writeToEndOfFile,
                             boolean constrainedIo) throws NTStatusException {
        return null;
    }

    @Override
    @NotImplemented
    public FileInfo flush(FSP_FILE_SYSTEM fileSystem, String fileName) throws NTStatusException {
        return null;
    }

    @Override
    @NotImplemented
    public FileInfo getFileInfo(FSP_FILE_SYSTEM fileSystem, OpenContext ctx) throws NTStatusException {
        return null;
    }

    @Override
    @NotImplemented
    public FileInfo setBasicInfo(FSP_FILE_SYSTEM fileSystem,
                                 OpenContext ctx,
                                 Set<FileAttributes> fileAttributes,
                                 WinSysTime creationTime,
                                 WinSysTime lastAccessTime,
                                 WinSysTime lastWriteTime,
                                 WinSysTime changeTime) throws NTStatusException {
        return null;
    }

    @Override
    @NotImplemented
    public FileInfo setFileSize(FSP_FILE_SYSTEM fileSystem,
                                String fileName,
                                long newSize,
                                boolean setAllocationSize) throws NTStatusException {
        return null;
    }

    @Override
    @NotImplemented
    public void canDelete(FSP_FILE_SYSTEM fileSystem, OpenContext ctx) throws NTStatusException {

    }

    @Override
    @NotImplemented
    public void rename(FSP_FILE_SYSTEM fileSystem,
                       OpenContext ctx,
                       String newFileName,
                       boolean replaceIfExists) throws NTStatusException {

    }

    @Override
    @NotImplemented
    public byte[] getSecurity(FSP_FILE_SYSTEM fileSystem, OpenContext ctx) throws NTStatusException {
        return null;
    }

    @Override
    @NotImplemented
    public void setSecurity(FSP_FILE_SYSTEM fileSystem,
                            OpenContext ctx,
                            byte[] securityDescriptor) throws NTStatusException {
    }

    @Override
    @NotImplemented
    public void readDirectory(FSP_FILE_SYSTEM fileSystem,
                              String dirName,
                              String pattern,
                              String marker,
                              Predicate<FileInfo> consumer) throws NTStatusException {
    }

    @Override
    @NotImplemented
    public FileInfo getDirInfoByName(FSP_FILE_SYSTEM fileSystem, String parentDirName, String fileName)
            throws NTStatusException {
        return null;
    }

    @Override
    @NotImplemented
    public byte[] getReparsePointData(FSP_FILE_SYSTEM fileSystem, OpenContext ctx) throws NTStatusException {
        return null;
    }

    @Override
    @NotImplemented
    public void setReparsePoint(FSP_FILE_SYSTEM fileSystem, OpenContext ctx, byte[] reparseData, int reparseTag)
            throws NTStatusException {
    }

    @Override
    @NotImplemented
    public void deleteReparsePoint(FSP_FILE_SYSTEM fileSystem, OpenContext ctx) throws NTStatusException {

    }
}
