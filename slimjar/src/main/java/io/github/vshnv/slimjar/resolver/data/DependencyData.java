package io.github.vshnv.slimjar.resolver.data;

import io.github.vshnv.slimjar.relocation.RelocationRule;

import java.util.Collection;
import java.util.Objects;

public final class DependencyData {

    private final Collection<Mirror> mirrors;
    private final Collection<Repository> repositories;
    private final Collection<Dependency> dependencies;
    private final Collection<RelocationRule> relocations;

    public DependencyData(
            final Collection<Mirror> mirrors,
            final Collection<Repository> repositories,
            final Collection<Dependency> dependencies,
            final Collection<RelocationRule> relocations
    ) {
        this.mirrors = mirrors;
        this.repositories = repositories;
        this.dependencies = dependencies;
        this.relocations = relocations;
    }

    public Collection<Repository> getRepositories() {
        return repositories;
    }

    public Collection<Dependency> getDependencies() {
        return dependencies;
    }

    public Collection<RelocationRule> getRelocations() {
        return relocations;
    }

    public Collection<Mirror> getMirrors() {
        return mirrors;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final DependencyData that = (DependencyData) o;
        return Objects.equals(repositories, that.repositories) && Objects.equals(dependencies, that.dependencies) && Objects.equals(relocations, that.relocations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositories, dependencies, relocations);
    }

    @Override
    public String toString() {
        return "DependencyData{" +
                "mirrors=" + mirrors +
                ", repositories=" + repositories +
                ", dependencies=" + dependencies +
                ", relocations=" + relocations +
                '}';
    }
}
