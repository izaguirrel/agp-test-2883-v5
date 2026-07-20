# AGP Test Repository V3 (GUIDE-2883)

Test repository for Agent P GA Pricing feature testing.

## Setup

### Repository Variables/Secrets

Set these in Settings → Secrets and variables → Actions:

- **AGP_API_URL** (Variable): `https://api.guide-dev.sonatype.dev`
- **AGP_API_TOKEN** (Secret): A Guide PAT for authentication

### Self-Hosted Runner

Ensure your self-hosted runner is active and connected to this repo.

## Test Cases

| Test | Description | Balance | Expected |
|------|-------------|---------|----------|
| T1 | Start-gate blocks | 199 | 402, no run created ✅ PASSED |
| T2 | Multi-PR charge | ≥ 250 | Base + PRs×rate |
| T3 | 0-PR flat charge | ≥ 200 | Flat fee (no PRs) |
| T4 | Shortfall (amber) | 200, drain mid-run | Partial charge + skipped |
| T5 | No charge (cancelled) | ≥ 200 | Cancel early, no charge |
| T6 | Legacy fallback | ≥ 1 | No GA user |
| T7 | Cross-tenant 404 | N/A | 404 for other tenant |

## Dependencies

8 outdated dependencies with known CVEs: jackson-databind, guava, log4j-core, spring-web, snakeyaml, commons-lang3, netty-all, protobuf-java.
